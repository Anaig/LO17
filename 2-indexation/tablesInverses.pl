#!/usr/bin/perl
@balises = ("date","rubrique", "titre", "contact", "texte", "urlImage", "legendeImage");
$corpus = "corpus_P16_ss_balise_5.xml";
foreach $bal (@balises) {
	`perl index.pl $bal $corpus > inverses/inverse_$bal.txt`;
}
`cat $corpus | perl segmente_TT.pl -r -f -n| perl indexTexte.pl > inverses/inverse.txt`;



