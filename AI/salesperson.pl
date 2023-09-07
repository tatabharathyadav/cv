road(a,b,20).
road(a,d,22).
road(a,c,40).
road(b,c,13).
road(c,d,12).
road(d,a,22).
road(c,a,40).
road(b,a,20).
get_road(Start,End,Visited,Result):-
get_road(Start,End,[Start],0,Visited,Result).
get_road(Start,End,Waypoints,Distacc,Visited,Totaldist):-
road(Start,End,Distance),
reverse([End|Waypoints],Visited),
Totaldist is Distacc+Distance.
get_road(Start,End,Waypoints,Distac,Visited,Totaldist):-
road(start,Waypoint,Distance),
not(member(Waypoint,Waypoints)),
Newdistance is Distacc+Distance,
get_road(Waypoint,End,[Waypoint|Waypoints],NewDistance,Visited,Totaldist).