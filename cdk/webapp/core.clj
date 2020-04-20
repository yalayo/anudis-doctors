(ns webapp.core
  (:require [stedi.cdk.alpha :as cdk]))

(cdk/import [[App Stack] :from "@aws-cdk/core"]
            [[Bucket] :from "@aws-cdk/aws-s3"]
            [[BucketDeployment Source] :from "@aws-cdk/aws-s3-deployment"])

(def app (App))

(def stack (Stack app "anudis-doctors-web"))

(def bucket
  (Bucket stack
          "anudis-doctors-web-bucket"
          {:publicReadAccess true
           :websiteIndexDocument "index.html"
           }))

(def deployment
  (BucketDeployment stack
                    "anudis-doctors-deployment"
                    {:sources [(Source/asset "dist/")]
                     :destinationBucket bucket
                     }))

