1) для каждого катера вывести даты выхода в море с указанием улова
SELECT  t.gotoFishing, f.weight,f.sort ,b.name from tracks t  left join public.fish f on t.id = f.track_id left join public.boat b on b.id = t.boat_id;

2) для каждого катера вывести количество рейсов
select b.name, count(w.boat_id)as count_total from public.boat b left join public.tracks w on b.id = w.boat_id group by b.name;
3) вывести список катеров, которые получили улов выше заданного значения
select name from boat left join public.tracks t on boat.id = t.boat_id left join public.fish f on t.id = f.track_id
where weight > 10;
4) вывести список сортов рыбы и для каждого сорта список рейсов с указанием даты выхода и возвращения, количества улова
select  f.sort,f .weight, t.gotofishing,t.comeback from fish f left join public.tracks t on t.id = f.track_id order by f.sort;