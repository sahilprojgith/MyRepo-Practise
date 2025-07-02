%first.pl

%Facts
parent(John,mary).
parent(John,Mike).
parent(mary,tom).

%Rule
grandparent(X, Y) :- parent(X,Z), parent(Z,Y).
