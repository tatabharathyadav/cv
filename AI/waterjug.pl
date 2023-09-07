water_jug(X,Y):-X>5,Y<3,write('5L waterjug overflowed.'),nl.
water_jug(X,Y):-X<5,Y>3,write('3L waterjug overflowed.'),nl.
water_jug(X,Y):-X>5,Y>3,write('Both waterjug overflowed.'),nl.
water_jug(X,Y):-
(X=:=0,Y=:=0,nl,write('5L:0& 3L:3(Action: Fill 3L jug.)'),YY is 3,water_jug(X,YY));
(X=:=0,Y=:=3,nl,write('5L:3 & 3L:0(Action :pour water from 3Lto  5L jug.)'),XX is 3,YY is 0 ,water_jug(XX,YY));
(X=:=3,Y=:=0,nl,write('5L:3 & 3L:3(Action :Fill 3L jug.)'),YY is 3,water_jug(X,YY));
(X=:=3,Y=:=3,nl,write('5L:5 & 3L:1(Action :pour water from 3Lto  5L jug until 5L jug is full.)'),XX is X+2,YY is Y-2 ,water_jug(XX,YY));
(X=:=5,Y=:=1,nl,write('5L:0 & 3L:1(Action :Empty 5L jug.)'),XX is 0,water_jug(XX,Y));
(X=:=0,Y=:=1,nl,write('5L:1 & 3L:0(Action :Pour water from 3L jug to 5L jug.)'),XX is Y,YY is X,water_jug(XX,YY));
(X=:=1,Y=:=0,nl,write('5L:1 & 3L:3(Action : Fill 3L jug .)'),YY is 3 ,water_jug(X,YY));
(X=:=1,Y=:=3,nl,write('5L:4 & 3L:0(Action :Empty  3L jug into 5L jug.)'),XX is X+Y,YY is 0 ,water_jug(XX,YY));
(X=:=4,Y=:=0,nl,write('4L:4 & 3L:0(Action :Goal reached...)'));
(X=:=0,Y=:=0,nl,write('5L:5& 3L:0(Action: Fill 5L jug.)'),XX is 5,water_jug(XX,Y));
(X=:=5,Y=:=0,nl,write('5L:2 & 3L:3(Action :pour water from 5L to 3L jug until 3L is full.)'),XX is X-3,YY is 3,water_jug(XX,YY));
(X=:=2,Y=:=3,nl,write('5L:2 & 3L:0(Action :Empty  3L jug.)'),YY is 0 ,water_jug(X,YY));
(X=:=2,Y=:=0,nl,write('5L:0& 3L:2 (Action:Empty 5L jug to 3L jug)'),XX is Y,YY is X,water_jug(XX,YY));
(X=:=0,Y=:=2,nl,write('5L:5 &3L:2(Action :Fill 5L jug.)'),XX is 5,water_jug(XX,Y));
(X=:=5,Y=:=2,nl,write('5L:4& 3L:3(Action :pour water from 5L to 3L jug untill 3L jug is full.)'),XX is X-1,YY is Y+1,water_jug(XX,YY));
(X=:=4,Y=:=3,nl,write('5L:4& 3L:3(Action :Goal Reached.)')).
