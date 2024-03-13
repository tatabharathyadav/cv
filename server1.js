// const express=require('express');
// const dotEnv=require('dotenv');
// const mongoose=require('mongoose');
// const bodyParser=require('body-parser');
// const app=express();
// const PORT=process.env.PORT||5000;

// //mongodb connection

// dotEnv.config();
// mongoose.connect(process.env.MONGO_URI)
// .then(()=>
// {
//     console.log("mongodb connected successfully");
// })
// .catch((error)=>
// {
//     console.log(error);

// })
// app.listen(PORT,()=>
// {
//     console.log("server statred and running");
// })


const express = require('express');
const dotEnv = require('dotenv');
const mongoose = require('mongoose');
const bodyParser=require('body-parser');
const employeeRoutes=require('./routes/employeeRoutes')

const app = express();
const PORT=process.env.PORT||5000;
dotEnv.config();
app.use(bodyParser.json());

const MONGO_URI = process.env.MONGO_URI;

mongoose.connect(MONGO_URI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => {
        console.log("MongoDB connected successfully");
        app.listen(PORT, () => {
            console.log('Server is running at ' + PORT);
        });
    })
    .catch((error) => {
        console.error("Error connecting to MongoDB:", error);
    });



    //middlewares
    app.use('/employees',employeeRoutes)



    app.listen(PORT,()=>
    {
       console.log("server statred and running");
    })
