terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 3.0.2"
    }
  }
}

provider "docker" {}

resource "docker_image" "flask_app" {
  name         = "flask-app:latest"
  keep_locally = false
  build {
    context = "../"
    dockerfile = "Dockerfile"
  }
}

resource "docker_container" "flask_container" {
  name  = "flask-app-container"
  image = docker_image.flask_app.image_id
  ports {
    internal = 5000
    external = 5000
  }
}
