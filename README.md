### Para requisições GET

> /centros/{id}

> /professores/{id}

### Para requisições POST

- Centros
> /centros

`{
  "nome": "CTC"
}`

- Professores
> /professores

`{
    "nome": "Julia",
    "cpf": "888",
    "centro": {
        "id": 1
    }
}`
