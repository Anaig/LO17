#!/usr/bin/perl

$mot=lo17;
while(<>) {
	if (/([0-9]+.\w+).+?([a-zÂ-Ü0-9]+).+?([0-9]+?(.[0-9]+)?)?/) {
		 	if($2 eq $mot) {
		 		$total += $3;
		 		$occurence++;
		 	}
		 	else {
		 		if ($mot ne "lo17") {
		 			$moy = $total/$occurence; 
		 			print "$mot\t$moy\n";
		 		}

		 		$mot = $2;
		 		$total = $3;
		 		$occurence = 1;
		 	}
	}
}
