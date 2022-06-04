--------------------------------------------------
			TREBAS PROJECT ONE
--------------------------------------------------

Trebas messager project!

Team: 
User u1 = new User(null,"Ajay");
User u2 = new User(null,"Bavleen");
User u3 = new User(null,"Kajal");
User u4 = new User(null,"Nancy");
User u5 = new User(null,"Navjot");
User u6 = new User(null,"Gurnoor");
User u7 = new User(null,"Raymond");
User u8 = new User(null,"Santiago");
User u9 = new User(null,"Thiago");






----------------------------------------------------------
					USER
----------------------------------------------------------

-- Find all users:

GET -> http://localhost:8080/user

-----------------------------------------

-- Find user by ID:

GET -> http://localhost:8080/users/1

-----------------------------------------

--REQUEST:
POST -> http://localhost:8080/users
{
    "name": "Cristiano Ronaldo"
}

--RETURN:
{
    "id": 10,
    "name": "Cristiano Ronaldo"
}



----------------------------------------------------------
					MESSAGE
----------------------------------------------------------

-- Find all messages:

GET -> http://localhost:8080/messages

-----------------------------------------

-- Find message by ID:

GET -> http://localhost:8080/messages/1

-----------------------------------------

-------------------------------------------

POST -> http://localhost:8080/messages

{
    "text": "A new project",
    "msgType": "LIFE",
    "insert_time": "2022-06-03T23:12:34Z",
    "user": {
        "id": 4
    }
}


