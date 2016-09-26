#!/usr/bin/perl

$fichier = @ARGV[0];
$fichier =~s/BULLETINS\///;
$fichier =~s/.htm//;
$fichier='<fichier>'.$fichier.'</fichier>';
print "<bulletin>"."\n";
print $fichier;
print "\n";
while(<>){

#rubrique
#titre
if (/class="style96"><span class="style42">(.*)<br>(.*)class="style17">(.*)<\/span><\/p>/) {
		$rubrique='<rubrique>'.$1.'</rubrique>';
			$titre='<titre>'.$3.'</titre>';
			print $rubrique."\n";
			print $titre."\n"; 
		}
#numero
		if(/class="style32">BE France (\d{2,3})&nbsp/) {
			$numero='<numero>'.$1.'</numero>';
			print $numero."\n";
		}
#date
		if(/<span class="style42">&nbsp;&nbsp;(.*)<\/span>/) {
			$date='<date>'.$1.'</date>';
			print $date."\n";
		}
#texte
		if(/<p class="style96"><span class="style95">(.*)/) {
			$texte=$1;
			do {
				$ligne =(<>);
				$texte= $texte.$ligne;
			} until ($ligne=~ /<\/span><\/p>/);

			$texte=~s/<br \/>//g;
		}
#contact
		if(/<p class="style44"><span class="style85">(.*?)<\/span>/) {
		$contact = $1;
		$contact=~s/<.*?>/ /g;
		print '<contact>'."\n";
		print $contact."\n";
		print '</contact>'."\n";
}

}	
		print "<images>"."\n";
		$texte=~s/\n|\r|\f/ /g;
#images
		while ($texte=~ /<\/span>.*?(www\.bulletins-electroniques\.com\/Resources_fm\/actualites.*?\.jpg).*?<span class="style21"><strong>(.*?)<\/strong><\/span>/g) {
			print "<image>"."\n";
			$urlimage = "<urlImage>".$1."</urlImage>";
			print $urlimage."\n";
			$legendeimage = "<legendeImage>".$2."</legendeImage>";
			print $legendeimage."\n";
		
			print "</image>"."\n";
		}
		print "</images>"."\n";	

#finalisation texte
		$texte=~s/<\/span>.*?<span class="style95">/ /g;
		$texte=~s/<.*?>.*?<\/.*?>/ /g;
		$texte=~s/<\/.*?>/ /g;
		print '<texte>'."\n";
		print $texte."\n";
		print '</texte>'."\n";

print "</bulletin>"."\n";


