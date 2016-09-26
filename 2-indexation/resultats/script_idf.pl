#!/usr/bin/perl

while (<>) {
	if (/([0-9]+).+?([a-zÂ-Ü0-9]+)/) {
		$idf = log(326/$1)/log(10);
		print ("$2\t$idf\n");
	}
}
