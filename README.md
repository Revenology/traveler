# Travel Application Backend
This repository is the backend for the traveler-expo-app front end

## Setup
- In MySQL Workbench create 'traveler' Schema
```sql
CREATE SCHEMA traveler
```
- If you are using custom details, modify the applicaiton.properties

```properties
  spring.datasource.url = jdbc:mysql://localhost:3306/traveler
  spring.datasource.username = root #Update username if needed
  spring.datasource.password = MyPassword #Update password if needed
```
