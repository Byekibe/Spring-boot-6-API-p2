# Spring Boot CRUD API for Authors and Posts
### This project is a simple CRUD API built with Spring Boot that allows you to manage authors and their posts.
## Prerequisites
- Java 17+
- Maven or Gradle

## API Endpoints
#### The API exposes the following endpoints:

- GET /api/v1/authors: Get all authors

- GET /api/v1/authors/{id}: Get an author by ID

- POST /api/v1/authors: Create a new author

- PUT /api/v1/authors/{id}: Update an existing author

- DELETE /api/v1/authors/{id}: Delete an author

- GET /api/v1/posts: Get all posts

- GET /api/v1/posts/{id}: Get a post by ID

- POST /api/v1/posts: Create a new post (including author ID)

- PUT /api/v1/posts/{id}: Update an existing post

- DELETE /api/v1/posts/{id}: Delete a post

Note: The /api/v1/posts endpoint requires specifying the author ID when creating a new post.

## Documentation

## Contributing
Feel free to contribute to this project by creating pull requests. Please ensure your code adheres to the project's coding conventions and coding style.
