# spring-boot-kubernetes-config
# spring-boot-kubernetes-config
Make sure that the docker desktop is running and the kubernetes is enabled

- Build the project
  ```
  ./gradlew build
  ```

- Build a docker image
    ```json
    docker build .
    ```
- Tag the docker image
  ```
    docker tag <sha> spring-boot-kubernetes
  ```    

- Create a config map from the yml file
    ```json
     kubectl create configmap dev-config --from-file dev-config.yaml
    ```


- Create a kubernetes service
    ```json
    kubectl apply -f service.yml
    ```

- Create a kubernetes deployment
    ```json
    kubectl apply -f deployment.yml
    ```

- Port forward on the service
    ```json
    kubectl port-forward svc/my-service 8080:80
    ```

- Try hitting
  localhost:8080/welcome
  localhost:8080/goodbye

  it should show property value from config map
  which is 
Welcome to dev config map
Goodbye from dev config map
