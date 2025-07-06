<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Passport Registration</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 30px;
      background: #f0f0f0;
    }
    form {
      background: #fff;
      padding: 20px;
      border-radius: 8px;
      width: 500px;
      margin: auto;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    label {
      font-weight: bold;
      display: block;
      margin: 12px 0 5px;
    }
    input[type="text"],
    input[type="email"],
    input[type="password"],
    select {
      width: 100%;
      padding: 8px;
      box-sizing: border-box;
    }
    .inline {
      display: inline-block;
      margin-right: 15px;
    }
    .row {
      margin-bottom: 15px;
    }
    .buttons {
      text-align: center;
      margin-top: 20px;
    }
    .buttons button {
      padding: 10px 20px;
      margin: 0 10px;
      cursor: pointer;
    }
  </style>
</head>
<body>

<form id="registrationForm">
  <div class="row">
    <label>Register to apply at <span style="color:red">*</span></label>
    <label class="inline"><input type="radio" name="registerAt"> CPV Delhi</label>
    <label class="inline"><input type="radio" name="registerAt" checked> Passport Office</label>
  </div>

  <div class="row">
    <label>Passport Office <span style="color:red">*</span></label>
    <select required>
      <option value="">----- Select -----</option>
      <option>Bangalore</option>
      <option>Delhi</option>
      <option>Mumbai</option>
    </select>
  </div>

  <label>Given Name (Max 45 Characters) <span style="color:red">*</span></label>
  <input type="text" id="givenName" maxlength="45" required>

  <label>Surname (Max 45 Characters)</label>
  <input type="text" maxlength="45">

  <label>Date of Birth (DD/MM/YYYY) <span style="color:red">*</span></label>
  <input type="text" id="dob" placeholder="DD/MM/YYYY" required>

  <label>E-mail Id (Max 35 Characters) <span style="color:red">*</span></label>
  <input type="email" id="email" maxlength="35" required>

  <div class="row">
    <label>Do you want your Login Id to be same as E-mail Id? <span style="color:red">*</span></label>
    <label class="inline"><input type="radio" name="sameLoginEmail" value="yes"> Yes</label>
    <label class="inline"><input type="radio" name="sameLoginEmail" value="no" checked> No</label>
  </div>

  <label>Login Id <span style="color:red">*</span></label>
  <input type="text" id="loginId" required>

  <label>Password <span style="color:red">*</span></label>
  <input type="password" id="password" required>

  <label>Confirm Password <span style="color:red">*</span></label>
  <input type="password" id="confirmPassword" required>

  <label>Hint Question <span style="color:red">*</span></label>
  <select required>
    <option value="">----- Select -----</option>
    <option>Your pet's name?</option>
    <option>Your first school?</option>
  </select>

  <label>Hint Answer <span style="color:red">*</span></label>
  <input type="text" required>

  <div class="buttons">
    <button type="submit">Register</button>
    <button type="reset">Clear</button>
  </div>
</form>

<script>
  document.querySelectorAll('input[name="sameLoginEmail"]').forEach(radio => {
    radio.addEventListener('change', () => {
      if (radio.value === "yes") {
        document.getElementById("loginId").value = document.getElementById("email").value;
      } else {
        document.getElementById("loginId").value = "";
      }
    });
  });

  document.getElementById("registrationForm").addEventListener("submit", function (e) {
    const pw = document.getElementById("password").value;
    const cpw = document.getElementById("confirmPassword").value;
    if (pw !== cpw) {
      e.preventDefault();
      alert("Passwords do not match!");
    }
  });
</script>

</body>
</html>
