package KhanhVySang.demo.Config;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
 
// 	@Override
// 	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
// 		auth.in
// 		super.configure(auth);
// 	}

// 	@Override
// 	protected void configure(HttpSecurity http) throws Exception {
// 		// TODO Auto-generated method stub
// 		super.configure(http);
// 	}

    

// }

// 	// @Autowired
// 	// TaiKhoanService userDetailsService;
// 	// @Bean
// 	// public BCryptPasswordEncoder passwordEncoder() {
// 	// 	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
// 	// 	return bCryptPasswordEncoder;
// 	// }

//     // public void configure(HttpSecurity http) throws Exception{
//     //     http.csrf().disable();

//     //     // Các yêu cầu phải login với vai trò ROLE_EMPLOYEE hoặc ROLE_MANAGER.
// 	// 	// Nếu chưa login, nó sẽ redirect tới trang /admin/login.
//     //     http.authorizeRequests().antMatchers("/view/trangchu", 
//     //                                         "/view/cuahang", 
//     //                                         "/view/lienhe", 
//     //                                         "/view/profile")
// 	// 	.access("hasAnyRole('ROLE_ADMIN', 'ROLE_NHANVIEN', 'ROLE_KHACHHANG')");

// 	// 	// Các trang chỉ dành cho ADMIN, NHANVIEN
// 	// 	http.authorizeRequests().antMatchers("/nhanvien/taodonhang", 
//     //                                         "/nhanvien/trangthaigiaohang",
//     //                                         "/nhanvien/editsanpham",
//     //                                         "/nhanvien/editloaisanpham")
//     //     .access("hasRole('ROLE_ADMIN', 'ROLE_NHANVIEN')");

//     //     // Các trang chỉ dành cho ADMIN
//     //     http.authorizeRequests().antMatchers("/admin/themsanpham", 
//     //                                         "/admin/nhapsanpham",
//     //                                         "/admin/taotaikhoan", 
//     //                                         "/admin/themchucvu",
//     //                                         "/admin/themgiaohang",
//     //                                         "/admin/editdanhmuc")
//     //     .access("hasRole('ROLE_ADMIN')");

// 	// 	// Khi người dùng đã login, với vai trò XX.
// 	// 	// Nhưng truy cập vào trang yêu cầu vai trò YY,
// 	// 	// Ngoại lệ AccessDeniedException sẽ ném ra.
// 	// 	http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

// 	// 	// Cấu hình cho Login Form.
// 	// 	http.authorizeRequests().and().formLogin()//

// 	// 			// 
// 	// 			.loginProcessingUrl("/j_spring_security_check") // Submit URL
// 	// 			.loginPage("/admin/login")//
// 	// 			.defaultSuccessUrl("/view/trangchu")//
// 	// 			.failureUrl("/admin/login?error=true")//
// 	// 			.usernameParameter("taikhoan")//
// 	// 			.passwordParameter("matkhau")

// 	// 			// Cấu hình cho trang Logout.
// 	// 			// (Sau khi logout, chuyển tới trang home)
// 	// 			.and().logout().logoutUrl("/admin/logout").logoutSuccessUrl("/view/trangchu");

//     // }

