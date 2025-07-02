% Goal state
goal(state(2, _)).

% Move operations (rules)
move(state(X, Y), state(4, Y)) :- X < 4.                  % Fill 4-liter jug
move(state(X, Y), state(X, 3)) :- Y < 3.                  % Fill 3-liter jug

move(state(X, Y), state(0, Y)) :- X > 0.                  % Empty 4-liter jug
move(state(X, Y), state(X, 0)) :- Y > 0.                  % Empty 3-liter jug

% Pour from 4L to 3L
move(state(X, Y), state(X1, Y1)) :-
    X > 0, Y < 3,
    Transfer is min(X, 3 - Y),
    X1 is X - Transfer,
    Y1 is Y + Transfer.

% Pour from 3L to 4L
move(state(X, Y), state(X1, Y1)) :-
    Y > 0, X < 4,
    Transfer is min(Y, 4 - X),
    Y1 is Y - Transfer,
    X1 is X + Transfer.

% Search for solution
path(State, _, []) :- goal(State).
path(State, Visited, [Move | Moves]) :-
    move(State, Next),
    \+ member(Next, Visited),
    path(Next, [Next | Visited], Moves),
    Move = Next.
