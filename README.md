# SpringBootAppEngineFlex
A sample App Engine Flex app and Apigee API proxy w/ Shared Flow Bundle to mediate token exchange with GCP auth services.

This repo hosts a SpringBoot application which runs on Google Cloud Platform's App Engine Flex (AEF) environment. Its used in conjunction with an Apigee API proxy and showcases how to protect traffic flowing to the application while only being callable through the API proxy that gets deployed to Edge by modifying firewall rules in the AEF console.

To use this example please do the following setup in your environment:
