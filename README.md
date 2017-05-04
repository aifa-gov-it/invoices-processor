# Invoices Processor

## Dependencies

- Docker 1.12+

## How to convert the invoices from XML to JSON

1. Generate a XSD from the XML files: when running the container, mount the directories where you want to store the XSD output and containing the XML input.
    Example: `docker run --rm -it -v /path/to/xml/files/directory/:/usr/invoices-xsd-generator/xml -v /path/to/xsd/output/directory/:/usr/invoices-xsd-generator/xsd ferrarimarco/xsd-generator:latest`

1. Validate XML files using the generated XSD: when running the container, mount the directories where you want to store the XSD output and containing the XML input.

    Example: `docker run --rm -it -v //path/to/xml/files/directory/:/usr/invoices-xml-validator/xml  ferrarimarco/xml-validator:latest`

1. Convert XML to JSON: when running the container, mount the directories where you want to store the JSON output and containing the XML input.

    Example: `docker run --rm -it -v /path/to/json/output/directory:/usr/invoices-converter/json -v //path/to/xml/files/directory/:/usr/invoices-converter/xml ferrarimarco/xml-json:latest`

1. Process the JSONs using the JSON Invoice Processor (see below)

## JSON Invoice Processor

### Build

#### Manual Build Process

##### Dependencies

- Java JDK 8+
- Maven 3.3.9+

##### Procedure

You can build the source by running `mvn install` from the root of the project.

#### Dockerized Build Process

You can use a container to build the source if you don't want to install build dependencies. You only need to have Docker installed.

##### Dependencies

- Docker: 1.12+

##### Procedure

Run the build container, from the root of the project: `docker run -it -v $(pwd):/usr/src/app -w /usr/src/app --rm maven:3.3.9-jdk-8 mvn install`

### How to Run

#### Generate the SQL to update the DB

Run the `liquibase:updateSQL` Maven goal to generate an SQL script with the changes to apply to the database. The script will be in `target/liquibase/migrate.sql`
