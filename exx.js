const bodyParser = require('body-parser');
const express = require('express');
const app = express();
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({extended:true}));

const myModelSchema = new Schema({
    name: String,
    age: Number,
});

// Create a model based on the schema
const MyModel = mongoose.model('MyModel', myModelSchema);

// Connect to MongoDB
mongoose.connect('mongodb://localhost/myDatabase')
    .then(() => console.log('Connected to MongoDB'))
    .catch(err => console.error('Could not connect to MongoDB', err));


// Update a document
// MyModel.updateOne({ name: 'John Doe' }, { age: 31 })
//     .then(result => console.log('Document updated successfully:', result))
//     .catch(err => console.error('Error updating document:', err));

// // Delete a document
// MyModel.deleteOne({ name: 'John Doe' })
//     .then(result => console.log('Document deleted successfully:', result))
//     .catch(err => console.error('Error deleting document:', err));



app.post('/send',(req,res)=>{
    const names = req.body.name;
    const ages = req.body.age;
    res.send("Data sended");
    const newDocument = new MyModel({
        name: names,
        age: ages,
    });
    newDocument.save()
    .then(result => console.log('Document saved successfully:', result))
    .catch(err => console.error('Error saving document:', err));

    MyModel.find()
        .then(docs => console.log('Retrieved documents:', docs))
        .catch(err => console.error('Error retrieving documents:', err));
});


app.get('/',(req,res)=>{
    res.render('index');
})

app.listen(8081,()=>{
    console.log("server connected");
})