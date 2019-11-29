--Oracle DB Commands--
select * from global_name;
**************************
create table emptab(
 eid number,
 ename varchar2(10),
 esal number(13,3)
);
insert into emptab values(1,'A',3.3);
====================================
To comment any line use code
ctrl+shift+/ after selecting it
ctrl+shift+\ (to uncomment)
--------------------------
Open pre-defined class:
  ctrl+shift+T > enter full or partial name
                 use symbol * even
ex:
  ctrl+shift+T > Driver*Data*
  > double click on matching one                 
_________________________________________
User Library: if Jar not exist in maven
  (or unable to get from maven)
-> Create Library
	*windows menu->preferences->user library(Search)->new library->add ext jars->save and ok.
-> Link to Project
	*right click on project
	*choose build path->configure build path->library->add library->select user library
					   ->next and choose library->inish and ok.
