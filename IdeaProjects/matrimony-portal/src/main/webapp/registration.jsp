<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Matrimony Registration Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <style>
    body {
      background: linear-gradient(to right, #e0f7fa, #e1bee7);
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      color: #333;
      margin: 0;
      padding: 0;
    }

    header {
      background: linear-gradient(to right, #673ab7, #512da8);
      color: white;
      box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
    }

    header h1 {
      font-size: 2.3rem;
      margin: 0;
    }

    .container {
      background-color: #ffffff;
      border-radius: 20px;
      box-shadow: 0 8px 25px rgba(0, 0, 0, 0.1);
      padding: 35px;
      margin-top: 30px;
      margin-bottom: 50px;
    }

    h4.section-heading {
      color: #512da8;
      font-weight: 600;
      border-left: 5px solid #9575cd;
      padding-left: 10px;
      margin-bottom: 20px;
    }

    .form-label {
      font-weight: 500;
      color: #333;
    }

    .form-control {
      border-radius: 10px;
      background-color: #fafafa;
      border: 1px solid #ccc;
      box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.03);
    }

    .btn-purple {
      background: linear-gradient(to right, #7e57c2, #673ab7);
      color: white;
      border: none;
      border-radius: 30px;
      font-weight: 600;
      padding: 10px 30px;
      transition: all 0.3s ease-in-out;
    }

    .btn-purple:hover {
      background: linear-gradient(to right, #512da8, #7e57c2);
      transform: scale(1.05);
    }

    footer {
      background-color: #673ab7;
      color: white;
      box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.1);
    }

    footer small {
      font-size: 0.9rem;
    }
  </style>
</head>

<body>

  <!-- Header -->
  <header class="text-white text-center py-4 mb-4">
    <h1>Matrimony Registration Form</h1>
  </header>

  <!-- Form -->
  <div class="container">
    <form action="matrimonyRegistration" method="post">

      <!-- Personal Details -->
      <h4 class="section-heading">Personal Details</h4>
      <div class="row g-3">
        <div class="col-md-6">
          <label class="form-label">Full Name</label>
          <input type="text" class="form-control" name="fullName" required />
        </div>
        <div class="col-md-3">
          <label class="form-label">Date of Birth (DD/MM/YYYY)</label>
          <input type="text" class="form-control" name="dob" required />
        </div>
        <div class="col-md-3">
          <label class="form-label">Age</label>
          <input type="number" class="form-control" name="age" required />
        </div>
        <div class="col-md-6">
          <label class="form-label">Contact No</label>
          <input type="tel" class="form-control" name="contact" required />
        </div>
        <div class="col-md-6">
          <label class="form-label">Email</label>
          <input type="email" class="form-control" name="email" required />
        </div>
        <div class="col-12">
          <label class="form-label">Address</label>
          <input type="text" class="form-control" name="address" required />
        </div>
      </div>

      <!-- Family Background -->
      <h4 class="section-heading mt-4">Family Background</h4>
      <div class="row g-3">
        <div class="col-md-6">
          <label class="form-label">Father's Name</label>
          <input type="text" class="form-control" name="fatherName" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Father's Occupation</label>
          <input type="text" class="form-control" name="fatherOccupation" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Mother's Name</label>
          <input type="text" class="form-control" name="motherName" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Mother's Occupation</label>
          <input type="text" class="form-control" name="motherOccupation" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Number of Siblings</label>
          <input type="number" class="form-control" name="siblings" />
        </div>
        <div class="col-12">
          <label class="form-label">Sibling Details (Names, Ages, Occupations)</label>
          <input type="text" class="form-control" name="siblingsDetails" />
        </div>
      </div>

      <!-- Education & Career -->
      <h4 class="section-heading mt-4">Education & Career</h4>
      <div class="row g-3">
        <div class="col-md-6">
          <label class="form-label">Highest Education</label>
          <input type="text" class="form-control" name="highestEducation" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Degree/Qualification</label>
          <input type="text" class="form-control" name="qualification" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Occupation</label>
          <input type="text" class="form-control" name="occupation" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Employer</label>
          <input type="text" class="form-control" name="employer" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Work Location</label>
          <input type="text" class="form-control" name="workLocation" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Annual Income</label>
          <input type="text" class="form-control" name="annualIncome" />
        </div>
      </div>

      <!-- Partner Preferences -->
      <h4 class="section-heading mt-4">Partner Preferences</h4>
      <div class="row g-3">
        <div class="col-md-4">
          <label class="form-label">Religion</label>
          <input type="text" class="form-control" name="partnerReligion" />
        </div>
        <div class="col-md-4">
          <label class="form-label">Caste (if any)</label>
          <input type="text" class="form-control" name="partnerCaste" />
        </div>
        <div class="col-md-4">
          <label class="form-label">Dietary Habits</label>
          <input type="text" class="form-control" name="partnerDiet" placeholder="Veg/Non-Veg/Eggetarian" />
        </div>
        <div class="col-md-6">
          <label class="form-label">Lifestyle</label>
          <input type="text" class="form-control" name="partnerLifestyle" placeholder="Simple/Modern/Traditional" />
        </div>
      </div>

      <!-- Physical Details -->
      <h4 class="section-heading mt-4">Physical Details (Optional)</h4>
      <div class="row g-3">
        <div class="col-md-4">
          <label class="form-label">Height</label>
          <input type="text" class="form-control" name="height" />
        </div>
        <div class="col-md-4">
          <label class="form-label">Weight</label>
          <input type="text" class="form-control" name="weight" />
        </div>
        <div class="col-md-4">
          <label class="form-label">Complexion</label>
          <input type="text" class="form-control" name="complexion" />
        </div>
      </div>

      <!-- Family Values -->
      <h4 class="section-heading mt-4">Family Values</h4>
      <input type="text" class="form-control mb-4" name="familyValues" placeholder="Traditional/Moderate/Modern" />

      <!-- Submit Button -->
      <div class="text-center">
        <button type="submit" class="btn btn-purple mt-3">Submit</button>
      </div>
    </form>
  </div>

  <!-- Footer -->
  <footer class="text-white text-center py-3">
    <small>&copy; 2025 Matrimony Portal</small>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>
