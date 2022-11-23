# Aquarium Backend
-- The Repo contains backend code of an Aquarium ecommerce web-application


### ER- Diagram

```mermaid
graph TD;
    Frontend-->CORS;
    CORS-->RestControllers;
    API-->RestControllers;
    RestControllers-->Services;
    RestControllers-->DTO;
    Services-->Repositories;
    Services-->DTO;
    Repositories-->Entity;
    Repositories-->DataBase;
```

> <p> <img align="center" width="90%" src="https://github.com/jitenpro/Aquarium-Backend/blob/main/ER%20Diagram.png" /> </p><br>


### Database Structure

> <p> <img align="center" width="90%" src="https://github.com/jitenpro/Aquarium-Backend/blob/main/Architec1.png" /> </p><br>




