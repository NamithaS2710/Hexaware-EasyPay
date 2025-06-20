<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="bootstrap_links.jsp"></jsp:include>

<body style="margin: 0; padding: 0;">
  <jsp:include page="menu.jsp"></jsp:include>

  <div class="container-fluid">
    <div class="row" style="height: 100vh;">
      
     
      <div class="col-sm-6 p-0" style="
        background-image: url('Payrollimg.jpg');
        background-size: cover;
        background-position: center;
        height: 100vh;">
      </div>

      
      <div class="col-sm-6 d-flex justify-content-center align-items-center bg-light">
        <div class="p-5 shadow rounded bg-white w-100" style="max-width: 650px;">
          <h3 class="text-center mb-4">SignIn Page</h3>
          <form action="logincheck" method="post">
            <div class="mb-3">
              <input type="text" value="${users.getUserId()}" class="form-control" name="userId" placeholder="User ID:" required>
            </div>
            <div class="mb-3">
              <input type="text" value="${users.getUsername()}" class="form-control" name="username" placeholder="Username:" required>
            </div>
            <div class="mb-3">
              <input type="password" class="form-control" name="passwordHash" placeholder="Password:" required>
            </div>
            <div class="mb-3 text-center">
              <button type="submit" class="btn btn-primary me-2">SignIn</button>
              <button type="reset" class="btn btn-danger">Reset</button>
            </div>
            <div class="text-danger text-center">
              ${msg}
            </div>
          </form>
        </div>
      </div>
      
    </div>
  </div>
</body>
</html>
