<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="bootstrap_links.jsp"></jsp:include>
<body style="background-color: #f0f2f5;">
     <jsp:include page="menu.jsp"></jsp:include>
	<div class="container-fluid">
			
			<div class="row mt-5">
					<div class="col-sm-6  bg-light" >
						<img alt="sorry..." class="img img-thumbnail" src="hexa_logo.png" style="height: 80vh; width: auto;">
					</div>
					<div class="col-sm-6 bg-grey">
						<h3>SignUp Page</h3>
						<form action="register"  method="post" >
							<div class="mb-3">
                                <input type="number" class="form-control" name="userId" placeholder="User ID:" required>
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" name="username" placeholder="Username:" required>
                            </div>
							<div class="mb-3">
								<input type="password" class="form-control" name="passwordHash" placeholder="Password:"  required>
							</div>
							<div class="mb-3">
                                <select class="form-control" name="role" required>
                                     <option value="">Select Role</option>
                                     <option value="employee">Employee</option>
                                     <option value="admin">Admin</option>
                                </select>
                            </div>
							<div class="mb-3">
								<input type="email" class="form-control" name="email" placeholder="Email:" required>
							</div>
							
							<div class="mb-3">
								<button type="submit" class="btn btn-primary">SignUp</button>
								<button type="reset" class="btn btn-danger" >Reset</button>
							</div>
							
						</form>
					</div>
			</div>
			
		</div>

</body>
</html>