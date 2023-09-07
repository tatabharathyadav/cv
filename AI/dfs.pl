connected(1,7,1).
connected(1,8,1).
connected(1,3,1).
connected(7,4,1).
connected(7,20,1).
connected(7,17,1).
connected(8,6,1).
connected(3,9,1).
connected(3,12,1).
connected(9,19,1).
connected(4,42,1).
connected(20,28,1).
connected(17,10,1).
connected2(x,y,D) :- connected(X,Y,D).
connected2(x,y,D) :- connected(Y,X,D).
next_node(Current,Next,Path) :-connected2(current,Next,_),
not(member(Next,path)).
depth_first(Goal,Goal,_,[Goal]).
depth_first(start,Goal,visited,[start[path]):-
next_node(start,Next_node,visited),
write(visited),n1,
depth_first(Next_node,Goal,[Next_node|visited],path).
