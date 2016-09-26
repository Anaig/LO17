#!/usr/bin/perl

@ls = `ls BULLETINS/*`;
foreach $fich (@ls) {
	print `title_script.pl $fich`;}
