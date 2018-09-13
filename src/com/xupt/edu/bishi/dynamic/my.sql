select host_ip
  from app_task
 where app_id in
       (select app_id
          from app
         group by app_id
        having count(*) >= ALL (select count(*)
                                 from app
                                group by app_id));



select app.app_name,Count(health_check) as task_count from app,app_task
     where app.id=app_task.app_id and health_check=1;