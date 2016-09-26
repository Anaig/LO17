#!/usr/bin/perl

$nom_fichier_idf = @ARGV[0];
$nom_fichier_tf = @ARGV[1];
open (FICHIERIDF, $nom_fichier_idf)||die("Erreur a l'ouverture de idf.txt");
while (<FICHIERIDF>) {
	if (/([a-zÂ-Ü0-9]+).+?([0-9]+?.[0-9]+)/) {
		$tab_idf{$1}=$2;
	}
}
close(FICHIERIDF);
open (FICHIERTF, $nom_fichier_tf)||die("Erreur a l'ouverture de td.txt");
while (<FICHIERTF>) {
	if(/([0-9]+).+?([a-zÂ-Ü0-9]+).+?([0-9]+.\w+)/) {
		$idf = $tab_idf{$2};
		$tfidf = $1*$idf;
		print "$3\t$2\t$tfidf\n";
	}
}
close(FICHIERTF);
