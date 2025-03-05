# Deploying Java App using Elastic Beanstalk Lab

## Objective

This lab demonstrates how to deploy a basic **Java** application using **AWS Elastic Beanstalk**. The workflow includes code versioning in **GitHub**, packaging the application as a **source bundle**, and deploying it via **Elastic Beanstalk** using an **S3 URL**.

## Features

- **Deploy Java Application** on AWS Elastic Beanstalk.
- **GitHub Integration** for version control.
- **Source Bundle** packaging and uploading to **S3**.
- **Elastic Beanstalk Deployment** from S3 URL.

## Tasks

### 1. **Commit Application Code to GitHub**

- Upload application code to a **GitHub repository**.
- The repository should contain all necessary files for the respective technology:
  - **Java**: Appropriate build files

### 2. **Prepare the Application Source Bundle**

- Package your application into a **zip file**.
- The zip file must contain the necessary files for your application to run:
  - Should include compiled `.jar` files and any dependencies.

### 3. **Upload to S3 Bucket**

- Upload the zipped source bundle to an **S3 bucket**.
- Ensure the **S3 URL** for the uploaded source bundle is accessible.

### 4. **Deploy via Elastic Beanstalk**

- In **Elastic Beanstalk**, use the **S3 URL** to deploy the application.

## Testing

- Visit [http://listo-elastic-beanstalk-app-env.eba-yvtmknpf.eu-north-1.elasticbeanstalk.com/](http://listo-elastic-beanstalk-app-env.eba-yvtmknpf.eu-north-1.elasticbeanstalk.com/) to see the deployed application
