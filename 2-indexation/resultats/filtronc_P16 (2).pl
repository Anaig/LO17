#!/usr/bin/perl


if ($ARGV[0] =~ /-v/) {
	shift(@ARGV);
	$bavard=1;
	}
$filein = $ARGV[0];
shift(@ARGV);
$fileout = $ARGV[0];
shift(@ARGV);
use open ':utf8';
open (FIN, "<$filein");
open (FOUT, ">$fileout");
while(<FIN>) {
	chop;
	($successeurs,$mot)=split(/\t/);
	$limite="3";
 	while ($successeurs =~ /(...*[123])([2-9])/) {
		$successeurs=$1.$2;
        if ($2 >= 9 || $limite==5) {
 #          si on trouve un maximum à 9 précédé d'un 1, inutile d'aller chercher plus loin
            last;
            }
        else {
		  $limite++;
          }
		}
	$res = substr ($mot,0,length($successeurs));
	if ($bavard==1) {	
			print FOUT ("$mot\t");
			}
	print FOUT ("$res\n");	
	}
