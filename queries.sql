## Part 1: Test it with SQL
SELECT * FROM techjobs.job;

## Part 2: Test it with SQL
SELECT * FROM techjobs.employer
WHERE location = "St Louis";

## Part 3: Test it with SQL
DROP TABLE techjobs.job;

## Part 4: Test it with SQL
SELECT name, description
FROM techjobs.skill
INNER JOIN techjobs.job ON techjobs.skills_id = techjobs.job_skills.jobs_id
WHERE jobs_id != null;