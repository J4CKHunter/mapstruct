
### entity mapping example with MapStruct (main focus) and ModelMapper (simple example)

##### API endpoints:

<pre>
    POST localhost:8080/api/v1/product
    - example request body in JSON format:
            {
                "productName": "iphone 15",
                "colour": "black",
                "price" : 15000,
                "supplier": {
                "name": "Apple",
                "address": "USA-China"
            }

    GET localhost:8080/api/v1/product
}
</pre>

