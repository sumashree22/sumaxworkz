<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Job Application Form (For Freshers)</title>
  <!-- Bootstrap 5 CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-info-subtle py-5">

  <!-- Themed Header (matches home page) -->
  <header class="bg-success text-white text-center py-4 mb-4">
    <h1 class="mb-0">Job Application Portal</h1>
  </header>

  <div class="container">
    <h2 class="text-success text-center mb-4">Job Application Form (For Freshers)</h2>

    <form class="bg-white p-4 rounded shadow-sm" action="jobApplication" method="post">
      <div class="row g-3">
        <div class="col-md-6">
          <label for="position" class="form-label">Position Applied For</label>
          <input type="text" class="form-control" id="position" name="position" required>
        </div>
        <div class="col-md-6">
          <label for="name" class="form-label">Full Name</label>
          <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="col-md-6">
          <label for="gender" class="form-label">Gender</label>
          <input type="text" class="form-control" id="gender" name="gender" required>
        </div>
        <div class="col-md-6">
          <label for="postal_address" class="form-label">Postal Address</label>
          <input type="text" class="form-control" id="postal_address" name="postalAddress" required>
        </div>
        <div class="col-md-6">
          <label for="permanent_address" class="form-label">Permanent Address</label>
          <input type="text" class="form-control" id="permanent_address" name="permanentAddress" required>
        </div>
        <div class="col-md-6">
          <label for="phone" class="form-label">Phone No.</label>
          <input type="tel" class="form-control" id="phone" name="phone">
        </div>
        <div class="col-md-6">
          <label for="alternate_Phone" class="form-label">Alternate Phone No.</label>
          <input type="tel" class="form-control" id="alternate_Phone" name="alternatePhone" required>
        </div>
        <div class="col-md-6">
          <label for="email" class="form-label">Email</label>
          <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="col-md-6">
          <label for="dob" class="form-label">Date of Birth</label>
          <input type="date" class="form-control" id="dob" name="dob" required>
        </div>
        <div class="col-md-6">
          <label for="marital_status" class="form-label">Marital Status</label>
          <input type="text" class="form-control" id="marital_status" name="maritalStatus">
        </div>
        <div class="col-md-6">
          <label for="qualification" class="form-label">Qualification (Education)</label>
          <input type="text" class="form-control" id="qualification" name="qualification">
        </div>
        <div class="col-md-6">
          <label for="university" class="form-label">University/Institution</label>
          <input type="text" class="form-control" id="university" name="university">
        </div>
        <div class="col-md-6">
          <label for="passing_year" class="form-label">Year of Passing</label>
          <input type="text" class="form-control" id="passing_year" name="passingYear">
        </div>
        <div class="col-md-6">
          <label for="internships" class="form-label">Internships/Projects (if any)</label>
          <input type="text" class="form-control" id="internships" name="internships">
        </div>
        <div class="col-md-6">
          <label for="skills" class="form-label">Skills</label>
          <input type="text" class="form-control" id="skills" name="skills">
        </div>
        <div class="col-md-6">
          <label for="languages" class="form-label">Languages Known</label>
          <input type="text" class="form-control" id="languages" name="languages">
        </div>
        <div class="col-md-6">
          <label class="form-label d-block">Willing to relocate anywhere in the country?</label>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="relocate" id="relocate_yes" value="Yes" required>
            <label class="form-check-label" for="relocate_yes">Yes</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="relocate" id="relocate_no" value="No">
            <label class="form-check-label" for="relocate_no">No</label>
          </div>
        </div>
        <div class="col-md-6">
          <label for="job_location" class="form-label">Preferred Job Location (if any)</label>
          <input type="text" class="form-control" id="job_location" name="jobLocation">
        </div>
        <div class="col-md-6">
          <label for="joining_date" class="form-label">Available to join from (date)</label>
          <input type="date" class="form-control" id="joining_date" name="joiningDate">
        </div>
      </div>

      <div class="text-center mt-4">
        <button type="submit" class="btn btn-success btn-lg px-4">Submit Application</button>
      </div>
    </form>
  </div>

  <!-- Footer -->
  <footer class="bg-dark text-white text-center py-3 mt-5">
    <div class="container">
      <small>&copy; 2025 Job Portal. All rights reserved.</small>
    </div>
  </footer>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
