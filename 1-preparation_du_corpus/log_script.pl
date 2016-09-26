#!/usr/bin/perl
while(<>){
	if (/<image>/) {
		$image++;
	}
	if (/<bulletin>/) {
		$bulletin++;
	}
	if (/<date>[0-9]{1,2}\/[0-9]{2}\/201[1-4]</) {
		$date++;
	}
	if (/<fichier>[0-9]{5}(.htm)?</) {
		$fichier++;
	}
	if (/<numero>2[0-9]{2}</) {
		$numero++;
	}
	if (/<rubrique>((Actualité(s?)[ -][Ii]nnovation(s?))|(Focus)|(En direct des [Ll]aboratoires)|(En direct des labos)|(Evénement)|(Du côté des [pP]ôles)|(Au coeur des [Rr]égions)|(Horizon(s?) [eE]nseignement)|(A lire)|(Horizon(s?) [Ff]ormation(s?))|(Horizons Formation Enseignement))</) {
		$rubrique++;
	}

	if (/<texte>.+?</) {
		$texte++;
	}
	if (/<urlImage>((www\.bulletins-electroniques\.com\/Resources_fm\/actualites.*?\.jpg)|((http:\/\/)?streaming\.yayimages\.com\/images\/edited\/photographer\/.*?\.jpg))</) {
		$urlImage++;
	}
	if (/<legendeImage>.+?</) {
		$legendeImage++;
	}
	if (/<contact>.+?</) { 
		$contact++;
	}

}
print "Il y a $image images.\n";
print "Il y a $bulletin bulletins.\n";
print "Il y a $date dates.\n";
print "Il y a $fichier fichiers.\n";
print "Il y a $numero numéros.\n";
print "Il y a $rubrique rubriques.\n";
print "Il y a $texte texte.\n";
print "Il y a $urlImage urlImages.\n";
print "Il y a $legendeImage legendeImages.\n";
print "Il y a $contact contacts.\n";
