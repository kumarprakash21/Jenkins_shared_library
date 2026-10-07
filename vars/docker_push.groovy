def call(String DOCKERHUB_USER, String IMAGE_NAME, String IMAGE_TAG){
  withCredentials([
                    usernamePassword(credentialsId: 'dockerhub',
                        usernameVariable: 'DOCKER_USER',passwordVariable: 'DOCKER_PASS'
                    )]) {
                sh """
            echo "Pushing image to docker hub"
            echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
            
            docker push ${DOCKERHUB_USER}/${IMAGE_NAME}:${IMAGE_TAG}
            echo "Images is succefully pussed to docker hub"
            """
}
}
