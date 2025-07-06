<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Pavithra Collections - Create Partner</title>
  <style>
    body {
      background: linear-gradient(to right, #2c5364, #203a43, #0f2027);
      color: #e0f7fa;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
      margin: 0;
    }

    h2 {
      color: #00bcd4;
      margin-bottom: 20px;
      font-size: 2.2em;
      text-align: center;
    }

    form {
      background-color: rgba(255, 255, 255, 0.05);
      padding: 30px 40px;
      border-radius: 14px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.4);
      display: flex;
      flex-direction: column;
      gap: 16px;
      width: 330px;
    }

    label {
      font-size: 1em;
      color: #b2ebf2;
    }

    input[type="text"],
    input[type="email"] {
      padding: 10px;
      border: none;
      border-radius: 8px;
      background-color: #355764;
      color: #ffffff;
      font-size: 1em;
    }

    input[type="text"]::placeholder,
    input[type="email"]::placeholder {
      color: #a0cfd3;
    }

    input[type="submit"] {
      background-color: #00bcd4;
      color: #ffffff;
      padding: 12px;
      border: none;
      border-radius: 8px;
      font-weight: bold;
      font-size: 1.1em;
      cursor: pointer;
      transition: all 0.3s ease;
      box-shadow: 0 4px 12px rgba(0, 188, 212, 0.3);
    }

    input[type="submit"]:hover {
      background-color: #ffffff;
      color: #00796b;
      transform: scale(1.05);
    }
  </style>
</head>
<body>

  <h2>Pavithra Collections</h2>

  <form action="createPartner" method="post">
    <label for="id1">Distributors:</label>
    <input type="text" id="id1" name="distributersName" required>

    <label for="id2">Address:</label>
    <input type="text" id="id2" name="adress" required>

    <label for="id3">Mobile Number:</label>
    <input type="text" id="id3" name="mobileNumber" required>

    <label for="id4">Total Cost:</label>
    <input type="text" id="id4" name="totalCost" required>

    <label for="id5">Email ID:</label>
    <input type="email" id="id5" name="emailId" required>

    <input type="submit" value="Submit">
  </form>

</body>
</html>
