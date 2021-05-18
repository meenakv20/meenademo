# meenademo

---------------------Problem 1 ----------------------
UrlPath : http://localhost:8080/createProducts
Scenario 1:
Request Body : 
{
"productId":"Prod2",
"productName":"Trousers",
"unitOfMeasure":"EACH"

}
Response : 
{
    "productId": "Prod2",
    "productName": "Trousers",
    "unitOfMeasure": "EACH",
    "status": "Exists",
    "launchDate": null
}

Scenario 2:
Request Body : 
{
"productId":"Prod4",
"productName":"Trousers",
"unitOfMeasure":"EACH"

}
Response : 
{
    "productId": "Prod4",
    "productName": "Trousers",
    "unitOfMeasure": "EACH",
    "status": "Created",
    "launchDate": null
}

--------------------Problem 2 ---------------------------
UrlPath : http://localhost:8080/sortProducts
Request Body : 
[
{
"productId":"Prod2",
"productName":"Trousers",
"unitOfMeasure":"EACH",
"launchDate": "2021-02-19"
},
{
"productId":"Prod1",
"productName":"Shirt",
"unitOfMeasure":"EACH",
"launchDate": "2021-02-21"
},
{
"productId":"Prod3",
"productName":"Tie",
"unitOfMeasure":"EACH",
"launchDate": "2021-02-22"
},
{
"productId":"Prod3",
"productName":"Tie",
"unitOfMeasure":"EACH",
"launchDate": "2021-02-24"
}
]

 
Response : 
[
    {
        "productId": "Prod3",
        "productName": "Tie",
        "unitOfMeasure": "EACH",
        "status": null,
        "launchDate": "2021-02-22"
    },
    {
        "productId": "Prod3",
        "productName": "Tie",
        "unitOfMeasure": "EACH",
        "status": null,
        "launchDate": "2021-02-24"
    },
    {
        "productId": "Prod2",
        "productName": "Trousers",
        "unitOfMeasure": "EACH",
        "status": null,
        "launchDate": "2021-02-19"
    },
    {
        "productId": "Prod1",
        "productName": "Shirt",
        "unitOfMeasure": "EACH",
        "status": null,
        "launchDate": "2021-02-21"
    }
]

