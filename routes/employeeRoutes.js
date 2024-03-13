const express=require('express');
const router=express.Router();
const employeeController=require("../controllers/employeecontroller");
const employee=require("../models/Employee")

router.post('/add-emp',employeeController.createEmployee);
module.exports=router;