# msc-dpm-b2c

We have three environments:
1. development -dmp-b2c.msc.development
2. staging -dmp-b2c.msc.staging
3. production -dmp-b2c.msc.production

# Domains connected :
1. users
2. auth
3. bodegas
4. onboarding
5. b2c-config

# Build 

gradle clean build 

## DB environment:
POSTGRES USER =postgres
POSTGRES PASSWORD =admin
MSC DMP B2C DATASOURCE URL=jdbc:postgresql://msc-dmp-b2c-db:5432/dmp_b2c_db
--routing-url http://localhost:8080/graphql

