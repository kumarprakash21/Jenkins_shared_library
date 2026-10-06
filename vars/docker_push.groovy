def call(String credID, String IMAGE_NAME, String IMAGE_TAG){
  withCredentials([
                    usernamePassword(credentialsId: "${credID}",
                        usernameVariable: 'DOCKER_USER',passwordVariable: 'DOCKER_PASS'
                    )]) {
                sh '''
            echo "Pushing image to docker hub"
            echo "docker login -u ${env.DOCKER_USER} -p ${env.DOCKER_PASS}"
            echo "docker image tag ${IMAGE_NAME}:${IMAGE_TAG} ${env.DOCKER_USER}/${IMAGE_NAME}:${IMAGE_TAG}"
            echo "docker push ${env.DOCKER_USER}/${IMAGE_NAME}:${IMAGE_TAG}"
            '''
}
}
