-- Part 1: Test it with SQL

-- Part 2: Test it with SQL

-- Part 3: Test it with SQL
DROP TABLE job;
-- "SELECT\\s+\\*\\s+FROM\\s+skill" +
--                   "\\s*(LEFT|INNER)?\\s+JOIN\\s+job_skills\\s+ON\\s+(skill.id\\s+=\\s+job_skills.skills_id|job_skills.skills_id\\s+=\\s+skill.id)" +
--                   "(\\s*WHERE\\s+job_skills.jobs_id\\s+IS\\s+NOT\\s+NULL)?" +
--                   "\\s*ORDER\\s+BY\\s+name\\s+ASC;"Part 4: Test it with SQL
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;