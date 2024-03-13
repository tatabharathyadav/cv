const express=require('express')
const dotEnv=require('dotenv')

const { MongoClient }=require('mongodb')
const app=express()

dotEnv.config()

MongoClient.connect(process.env.MONGO_URI)
    .then(()=>
{
     console.log("Mongodb connected succesfully")
})
.catch((error)=>
{
    console.log("Error",error)

})
const PORT=5000

console.log(process.env)
app.listen(PORT,()=>
{
    console.log("server is started and running")
})