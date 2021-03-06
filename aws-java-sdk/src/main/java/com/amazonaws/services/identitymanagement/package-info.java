
/**
 * Synchronous and asynchronous client classes for accessing AmazonIdentityManagement.
 *
 * AWS Identity and Access Management <p>
 * AWS Identity and Access Management (IAM) is a web service that you can
 * use to manage users and user permissions under your AWS account. This
 * guide provides descriptions of the IAM API. For general information
 * about IAM, see
 * <a href="http://aws.amazon.com/iam/"> AWS Identity and Access Management (IAM) </a> . For the user guide for IAM, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/"> Using IAM </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>AWS provides SDKs that consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby,
 * .NET, iOS, Android, etc.). The SDKs provide a convenient way to create
 * programmatic access to IAM and AWS. For example, the SDKs take care of
 * tasks such as cryptographically signing requests (see below), managing
 * errors, and retrying requests automatically. For information about the
 * AWS SDKs, including how to download and install them, see the Tools
 * for Amazon Web Services page.
 * </p>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls
 * to IAM. However, you can also use the IAM Query API to make direct
 * calls to the IAM web service. To learn more about the IAM Query API,
 * see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a>
 * in the <i>Using IAM</i> guide. IAM supports GET and POST requests
 * for all actions. That is, the API does not require you to use GET for
 * some actions and POST for others. However, GET requests are subject to
 * the limitation size of a URL. Therefore, for operations that require
 * larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed using an access key ID and a secret access
 * key. We strongly recommend that you do not use your AWS account access
 * key ID and secret access key for everyday work with IAM. You can use
 * the access key ID and secret access key for an IAM user or you can use
 * the AWS Security Token Service to generate temporary security
 * credentials and use those to sign requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 </a>
 * . If you have an existing application that uses Signature Version 2,
 * you do not have to update it to use Signature Version 4. However, some
 * operations now require Signature Version 4. The documentation for
 * operations that require version 4 indicate this requirement.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * IAM supports AWS CloudTrail, which is a service that records AWS
 * calls for your AWS account and delivers log files to an Amazon S3
 * bucket. By using information collected by CloudTrail, you can
 * determine what requests were successfully made to IAM, who made the
 * request, when it was made, and so on. To learn more about CloudTrail,
 * including how to turn it on and find your log files, see the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/whatisawscloudtrail.html"> AWS CloudTrail User Guide </a>
 * .
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information, see the following:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"> AWS Security Credentials </a>
 * . This topic provides general information about the types of
 * credentials used for accessing AWS.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html"> IAM Best Practices </a>
 * . This topic presents a list of suggestions for using the IAM service
 * to help secure your AWS resources.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/"> AWS Security Token Service </a>
 * . This guide describes how to create and use temporary security
 * credentials.</li>
 * <li>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a>
 * . This set of topics walk you through the process of signing a
 * request using an access key ID and secret access key.</li>
 * 
 * </ul>
 */
 package com.amazonaws.services.identitymanagement;
        