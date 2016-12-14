# Clojure Berlin 2016 Sample Service

A simple service showcasing continuous deployment on [Kubernetes][1] using [GitLab CI][2].

This service assumes a Kubernetes cluster and GitLab CI installation which is not available out-of-the box on public cloud. Please take this only as a starting point for your own private cloud continuous deployment environment.

## Usage

Given a working Kubernetes cluster and `kubectl` command line utility.

### Create the Kubernetes Service

`kubectl create -f kube-svc.yml`

### Push to GitLab

`git push`

## Development

`lein run`

## License

Copyright © 2016 Alexander Kiel

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

[1]: <http://kubernetes.io>
[2]: <https://about.gitlab.com/gitlab-ci/>
