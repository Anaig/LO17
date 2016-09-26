# LO17
Indexation & Data search

This project is an intelligent search engine looking into 327 HTML documents, which are scientific articles. It takes into account requests in natural langage. 

1. The documents were parsed with Perl in order to create a XML file containing essential data in a tree view. 
2. The tf-idf method was used to score and rank the words in each article. The terms defined as negligible were suppress of the XML corpus, the other words were lemmatized.
3. A spelling checker wad developed in Java, notably using the Levenshtein algorithm. 
4. A grammar was created with AntlrWorks in order to process natural language requests. 
5. A Java API was used to connect the programs with the Prostgresql data base.
6. An interface was designed with servlets

Examples of requests : 
- Which articles were written between 2010 and 2012 ?
- I would like the articles dealing with laboratories in the section "focus". 
- Who are the authors of the articles from the bulletin 279 ?
- How many articles talk about horses ?  


By Céline Aschenbrenner & Anaig Marechal
