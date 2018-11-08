<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="vi">
    
    <head>
        <title>Trang chủ</title>
        <!-- Meta tag Keywords -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8" />
        <meta name="keywords" content="HoangGia Spa"
        />
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);
    
            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
        <!-- //Meta tag Keywords -->
    
        <!-- Custom-Files -->
        <!-- Bootstrap-Core-CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/source/home/bootstrap.css">
        <!-- pop up box -->
        <link href="${pageContext.request.contextPath}/source/home/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
        <!-- gallery light box -->
        <link href="${pageContext.request.contextPath}/source/home/lsb.css" rel="stylesheet" type="text/css" media="all">
        <!-- Style-CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/source/home/style.css" type="text/css" media="all" />
        <!-- Font-Awesome-Icons-CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/source/home/fontawesome-all.css" type="text/css" media="all" >
        <!-- //Custom-Files -->
    
        
       
      
    
    </head>
    
    <body data-spy="scroll" data-target=".fixed-top">
        <div id="home">
            <!-- header -->
            <header>
                <!-- navbar -->
                <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
                    <a class="navbar-brand text-white font-weight-bold" href="index.jsp">
                        <span>H</span>oangGia
                        <span>S</span>pa</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-bars"></i>
                    </button>
    
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto text-center mr-xl-5 mt-lg-0 mt-3">
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#home">Home
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#about">About Us</a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#treat">Treatments</a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#services">Services</a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#pricing">Pricing</a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#team">Our Team</a>
                            </li>
                            <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                                <a class="nav-link scroll" href="#gallery">Gallery</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link scroll" href="#contact">Contact Us</a>
                            </li>
                            <li class="nav-item">
                                <div><a class="nav-link scroll" href="loginRequest">Đăng nhập</a></div>
                            </li>
                        </ul>
                    </div>
                </nav>
                <!-- //navbar ends here -->
            </header>
            <!-- //header -->
    
            <!-- banner -->
            <div class="banner-w3l">
                <div class="container">
                    <div class="banner-left-wthree">
                        <div class="banner-text-effectw3ls">
                            <div class="center-outer">
                                <div class="center-inner">
                                    <div class="bubbles">
                                        <h1>HoangGia Spa</h1>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <h4 class="text-dark text-capitalize sec-text-w3ls pt-lg-5 pt-4 pb-sm-4 pb-3">sessions of
                            <span>relaxation</span>
                        </h4>
                        <p class="text-capitalize mb-sm-4 mb-3">the balance and harmony of body and mind.
                            <span class="text-lowercase d-block">Negrar èla storia di uoini donne dediti alla Nullam dui dolor, sagittis ut nte eget.</span>
                        </p>
                        <a href="#small-dialog1" class="play-icon popup-with-zoom-anim btn mt-md-4 mt-3" title="Play Video">Watch Video</a>
                    </div>
                </div>
            </div>
            <!-- popup video -->
            <div id="small-dialog1" class="mfp-hide">
                <div class="agileits_modal_body">
                    <iframe src="https://player.vimeo.com/video/45062348"></iframe>
                </div>
            </div>
            <!-- //popup video -->
        </div>
        <!-- //banner -->
    
        <!-- about -->
        <div class="bottom-agile py-5" id="about">
            <div class="container py-xl-5 py-lg-3">
                <div class="about-top p-xl-5 p-sm-4 p-3 text-center">
                    <h3>Welcome</h3>
                    <p class="text-white mt-2 mb-4 mx-auto">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Lorem
                        ipsum dolor sit amet.
                    </p>
                    <img src="${pageContext.request.contextPath}/source/images/bo2.png" alt="" class="img-fluid">
                </div>
                <div class="row about-bottom-w3ls mt-md-5 mt-4">
                    <div class="col-md-4 grids-w3lsm">
                        <div class="top-head-abagile">
                            <h3 class="border-left text-capitalize text-dark pl-4 mb-4">special care
                                <span>solutions</span>
                            </h3>
                        </div>
                        <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore</p>
                    </div>
                    <div class="col-md-4 grids-w3lsm my-md-0 my-4">
                        <div class="top-head-abagile">
                            <h3 class="border-left text-capitalize text-dark pl-4 mb-4">body care &
                                <span>massage</span>
                            </h3>
                        </div>
                        <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore</p>
                    </div>
                    <div class="col-md-4 grids-w3lsm">
                        <div class="top-head-abagile">
                            <h3 class="border-left text-capitalize text-dark pl-4 mb-4">oils &
                                <span>aromatherapy</span>
                            </h3>
                        </div>
                        <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- //about -->
    
        <!-- treatments -->
        <div class="treat-agile" id="treat">
            <div class="rectangle" id="rec1">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-7 left-treat-w3l pb-5">
                            <div class="py-xl-5 py-lg-3">
                                <h3 class="text-capitalize font-weight-bold title mb-4">special treatments</h3>
                                <p></p>
                                <ul class="list-unstyled mt-4">
                                    <li>
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Keep your skin radiant this winter.
                                    </li>
                                    <li class="my-3">
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Created from natural herbs – Ginseng roots extract.
                                    </li>
                                    <li>
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Provide treatments and products that are safe, sanitary.
                                    </li>
                                    <li class="my-3">
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Quantity product from BB Wellness & Spa</li>
                                    <li>
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Keep your skin radiant this winter.
                                    </li>
                                    <li class="my-3">
                                        <i class="far fa-hand-point-right pr-xl-3 pr-2"></i> Provide treatments and products that are safe.
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-5 right-treat-w3l text-lg-right text-center px-lg-0">
                            <img src="${pageContext.request.contextPath}/source/images/treat3.png" alt="" class="img-fluid">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //treatments -->
    
        <!-- middle -->
        <div class="middle-sec text-center py-5 ">
            <div class="container py-xl-5 py-md-3">
                <h4 class="text-uppercase text-white">Improve The Quality Of Your Life</h4>
                <a href="#contact" class="scroll btn mt-sm-5 mt-4">Contact Us</a>
            </div>
        </div>
        <!-- //middle -->
    
        <!-- services -->
        <div class="services-w3ls py-5" id="services">
            <div class="container py-xl-5 py-lg-3">
                <h3 class="text-capitalize font-weight-bold text-center title mb-sm-5 mb-4">popular Services</h3>
                <div class="row text-sm-left text-center">
                    <div class="col-lg-3 col-sm-6 service-grid">
                        <img src="${pageContext.request.contextPath}/source/images/s1.jpg" alt="" class="img-fluid">
                        <h4 class="text-capitalize text-dark my-sm-4 my-3">hot stone</h4>
                        <p>Negrar èla storia di uoini donne dediti alla Nullam dui dolor, sagittis ut nte eget.</p>
                    </div>
                    <div class="col-lg-3 col-sm-6 service-grid mt-sm-0 mt-4">
                        <img src="${pageContext.request.contextPath}/source/images/s2.jpg" alt="" class="img-fluid">
                        <h4 class="text-capitalize text-dark  my-sm-4 my-3">aromatherapy</h4>
                        <p>Negrar èla storia di uoini donne dediti alla Nullam dui dolor, sagittis ut nte eget.</p>
                    </div>
                    <div class="col-lg-3 col-sm-6 service-grid mt-lg-0 mt-sm-5 mt-4">
                        <img src="${pageContext.request.contextPath}/source/images/s3.jpg" alt="" class="img-fluid">
                        <h4 class="text-capitalize text-dark  my-sm-4 my-3">facial peelings</h4>
                        <p>Negrar èla storia di uoini donne dediti alla Nullam dui dolor, sagittis ut nte eget.</p>
                    </div>
                    <div class="col-lg-3 col-sm-6 service-grid mt-lg-0 mt-sm-5 mt-4">
                        <img src="${pageContext.request.contextPath}/source/images/s4.jpg" alt="" class="img-fluid">
                        <h4 class="text-capitalize text-dark  my-sm-4 my-3">massages</h4>
                        <p>Negrar èla storia di uoini donne dediti alla Nullam dui dolor, sagittis ut nte eget.</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- //services -->
    
        <!-- video -->
        <div class="video-agileits pb-5">
            <div class="container pb-xl-5 pb-lg-3">
                <div class="agileits_modal_body2">
                    <iframe src="https://player.vimeo.com/video/123708006"></iframe>
                </div>
                <h3 class="text-capitalize font-weight-bold text-center title mb-4">spa overview</h3>
                <p class="text-white text-center"> sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation
                    ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>
        </div>
        <!-- //video -->
    
        <!-- price-->
        <div class="price-sec py-5" id="pricing">
            <div class="container pb-xl-5 pb-lg-3">
                <h3 class="text-capitalize font-weight-bold text-center title mb-sm-5 mb-4">our pricing table</h3>
                <div class="inner_sec_info_agile_w3_info">
                    <div class="row price-grid-main">
                        <div class="col-lg-4 price-info">
                            <div class="prices">
                                <div class="prices-top">
                                    <h3 class="text-center text-capitalize text-white pt-4">$30
                                        <span>per day</span>
                                    </h3>
                                </div>
                                <div class="prices-bottom text-center border p-4">
                                    <div class="prices-h border-bottom pb-4">
                                        <p class="font-weight-bold">1 Person</p>
                                        <h4>Personalized</h4>
                                    </div>
                                    <ul class="mt-4">
                                        <li>Makeup Application</li>
                                        <li class="my-3">Polish Change</li>
                                        <li>French Manicure</li>
                                        <li class="mt-3">Stone Massage</li>
                                        <li class="my-3">French Manicure</li>
                                        <li>Haircut & Stye</li>
                                        <li class="my-3">Signature Facial</li>
                                        <li>Stone Massage</li>
                                    </ul>
                                    <a href="#" data-toggle="modal" data-target="#myModal1" class="button mt-4">Sign Up</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 price-info my-lg-0 my-5">
                            <div class="prices">
                                <div class="prices-top">
                                    <h3 class="text-center text-capitalize text-white pt-4">$20
                                        <span>per day</span>
                                    </h3>
                                </div>
                                <div class="prices-bottom text-center border p-4">
                                    <div class="prices-h border-bottom pb-4">
                                        <p class="font-weight-bold">2 Persons</p>
                                        <h4>Personalized</h4>
                                    </div>
                                    <ul class="mt-4">
                                        <li>Stone Massage</li>
                                        <li class="my-3">Haircut & Stye</li>
                                        <li>Signature Facial</li>
                                        <li class="mt-3">French Manicure</li>
                                        <li class="my-3">Makeup Application</li>
                                        <li>Polish Change</li>
                                        <li class="my-3">Stone Massage</li>
                                        <li>Signature Facial</li>
                                    </ul>
                                    <a href="#" data-toggle="modal" data-target="#myModal1" class="button mt-4">Sign Up</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 price-info">
                            <div class="prices">
                                <div class="prices-top">
                                    <h3 class="text-center text-capitalize text-white pt-4">$36
                                        <span>per day</span>
                                    </h3>
                                </div>
                                <div class="prices-bottom text-center border p-4">
                                    <div class="prices-h border-bottom pb-4">
                                        <p class="font-weight-bold">3 Persons</p>
                                        <h4>Personalized</h4>
                                    </div>
                                    <ul class="mt-4">
                                        <li>French Manicure</li>
                                        <li class="my-3">Signature Facial</li>
                                        <li>Stone Massage</li>
                                        <li class="mt-3">Stone Massage</li>
                                        <li class="my-3">Makeup Application</li>
                                        <li>Haircut & Stye</li>
                                        <li class="my-3">Polish Change</li>
                                        <li>French Manicure</li>
                                    </ul>
                                    <a href="#" data-toggle="modal" data-target="#myModal1" class="button mt-4">Sign Up</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal1 -->
        <div class="modal" tabindex="-1" role="dialog" id="myModal1">
            <div class="modal-dialog" role="document">
                <div class="modal-content book-form p-3">
                    <div class="modal-header p-3">
                        <h5 class="modal-title">Sign Up</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="#" method="post">
                            <div class="form-group">
                                <input type="text" name="Name" placeholder="Your Name" class="form-control" required="" />
                            </div>
                            <div class="form-group">
                                <input type="email" name="Email" class="email form-control" placeholder="Email" required="" />
                            </div>
                            <div class="form-group">
                                <input type="password" name="Password" class="password form-control" placeholder="Password" id="password1" required="" />
                            </div>
                            <div class="form-group">
                                <input type="password" name="Password" class="password form-control" placeholder="Confirm Password" id="password2" required=""
                                />
                            </div>
                            <div class="check-box">
                                <input name="chekbox" type="checkbox" id="brand" value="">
                                <label for="brand">
                                    <span></span>Remember Me</label>
                            </div>
                            <input type="submit" class="mt-4" value="Sign Up">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- //modal1 -->
        <!--//price-->
    
        <!-- accordions -->
        <div class="accord-agile py-5">
            <div class="rectangle" id="rec2">
                <div class="container py-xl-5 py-lg-3">
                    <div class="left-treat-w3l-2 offset-lg-5">
                        <div id="accordion">
                            <div class="card">
                                <div class="card-header" id="headingOne">
                                    <h5 class="mb-0">
                                        <button class="btn btn-link text-white heading-w3ls" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true"
                                            aria-controls="collapseOne">
                                            eatae vitae dicta sunt explicabo
                                        </button>
                                    </h5>
                                </div>
    
                                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                                    <div class="card-body">
                                        consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                    </div>
                                </div>
                            </div>
                            <div class="card my-4">
                                <div class="card-header" id="headingTwo">
                                    <h5 class="mb-0">
                                        <button class="btn btn-link collapsed text-white heading-w3ls" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false"
                                            aria-controls="collapseTwo">
                                            eius modi tempora labore et
                                        </button>
                                    </h5>
                                </div>
                                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                                    <div class="card-body">
                                        consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                    </div>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header" id="headingThree">
                                    <h5 class="mb-0">
                                        <button class="btn btn-link collapsed text-white heading-w3ls" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false"
                                            aria-controls="collapseThree">
                                            Neque porro quisquam ipsum quia
                                        </button>
                                    </h5>
                                </div>
                                <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                                    <div class="card-body">
                                        consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //accordions -->
    
        <!-- team -->
        <div class="team-w3 py-5" id="team">
            <div class="container py-xl-5 py-lg-3">
                <h3 class="text-capitalize font-weight-bold text-center title  mb-sm-5 mb-4">our team</h3>
                <div class="row w3_services_grids">
                    <div class="col-md-3 col-6 w3ls_team_grid">
                        <div class="w3ls_team_grid1 hover15">
                            <figure class="mb-0">
                                <img src="${pageContext.request.contextPath}/source/images/t1.jpg" alt=" " class="img-fluid" />
                            </figure>
                            <div class="w3ls_team_grid1_pos">
                                <ul class="social-icons">
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-facebook-f"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-twitter"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-instagram"></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="team-text-w3ls p-3">
                            <h4 class="text-dark my-2">Lisa Jan</h4>
                            <p>Beauty Expert</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-6 w3ls_team_grid">
                        <div class="w3ls_team_grid1 hover15">
                            <figure class="mb-0">
                                <img src="${pageContext.request.contextPath}/source/images/t2.jpg" alt=" " class="img-fluid" />
                            </figure>
                            <div class="w3ls_team_grid1_pos">
                                <ul class="social-icons">
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-twitter"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-instagram"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-facebook-f"></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="team-text-w3ls p-3">
                            <h4 class="text-dark my-2">Sally Zoe</h4>
                            <p>Beauty Expert</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-6 w3ls_team_grid mt-md-0 mt-4">
                        <div class="w3ls_team_grid1 hover15 w3l-tem-k">
                            <figure class="mb-0">
                                <img src="${pageContext.request.contextPath}/source/images/t3.jpg" alt=" " class="img-fluid" />
                            </figure>
                            <div class="w3ls_team_grid1_pos">
                                <ul class="social-icons">
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-instagram"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-facebook-f"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-twitter"></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="team-text-w3ls p-3">
                            <h4 class="text-dark my-2">Maria Lily</h4>
                            <p>Beauty Expert</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-6 w3ls_team_grid mt-md-0 mt-4">
                        <div class="w3ls_team_grid1 hover15 w3l-tem-k-2">
                            <figure class="mb-0">
                                <img src="${pageContext.request.contextPath}/source/images/t4.jpg" alt=" " class="img-fluid" />
                            </figure>
                            <div class="w3ls_team_grid1_pos">
                                <ul class="social-icons">
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-pinterest-p"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-twitter"></a>
                                    </li>
                                    <li>
                                        <a href="#" class="icon icon-border fab fa-instagram"></a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="team-text-w3ls p-3">
                            <h4 class="text-dark my-2">Ella Gra</h4>
                            <p>Beauty Expert</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //team -->
    
        <!-- gallery -->
        <div class="gallery pb-5" id="gallery">
            <div class="container-fluid pb-xl-5 pb-lg-3">
                <h3 class="text-capitalize font-weight-bold text-center title  mb-sm-5 mb-4">our gallery</h3>
                <div class="row w3layouts_gallery_grids">
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g1.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g1.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g2.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g2.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g3.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g3.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g4.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g4.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="row w3layouts_gallery_grids">
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g5.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g5.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g6.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g6.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g7.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g7.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-md-3 col-sm-6 w3layouts_gallery_grid p-0">
                        <a href="${pageContext.request.contextPath}/source/images/g8.jpg" class="lsb-preview" data-lsb-group="header">
                            <div class="w3layouts_news_grid">
                                <img src="${pageContext.request.contextPath}/source/images/g8.jpg" alt=" " class="img-fluid">
                                <div class="w3layouts_news_grid_pos">
                                    <div class="wthree_text">
                                        <h3 class="text-white font-weight-bold">HoangGia Spa</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <!-- //gallery -->
    
        <!-- contact -->
        <div class="mail" id="contact">
            <div class="container pb-sm-5 pb-3">
                <h3 class="text-capitalize font-weight-bold text-center title  mb-sm-5 mb-4">contact us</h3>
                <div class="row agileinfo_mail_grids">
                    <div class="col-lg-8 agileinfo_mail_grid_right">
                        <form action="#" method="post">
                            <div class="row">
                                <div class="col-md-6 wthree_contact_left_grid pr-md-0">
                                    <div class="form-group">
                                        <input type="text" name="name" class="form-control" placeholder="Name" required="">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" name="email" class="form-control" placeholder="Email" required="">
                                    </div>
                                </div>
                                <div class="col-md-6 wthree_contact_left_grid">
                                    <div class="form-group">
                                        <input type="text" name="phone number" class="form-control" placeholder="Phone Number" required="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="subject" class="form-control" placeholder="Subject" required="">
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <textarea name="message" placeholder="Message" class="form-control" required=""></textarea>
                            </div>
                            <div class="submit-buttons">
                                <input type="submit" value="Submit">
                                <input type="reset" value="Clear">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="map">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.479840319646!2d106.76982351446843!3d10.851061660779607!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3175270ad28d48ab%3A0xa6c02de0a7c40d6c!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBTxrAgcGjhuqFtIEvhu7kgdGh14bqtdCBUcC4gSOG7kyBDaMOtIE1pbmg!5e0!3m2!1svi!2s!4v1541581623364" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                <div class="contact-grid-agiles p-xl-5 p-4">
                    <h4 class="heading-con-w3ls text-white mb-xl-5 mb-4">Contact Info
                        <i class="fas fa-hand-point-down ml-2"></i>
                    </h4>
                    <ul class="list-unstyled">
                        <li class="text-light">
                            <i class="fas fa-map-marker pr-3 text-dark"></i>25095 Blue Ravine Rd, USA</li>
                        <li class="text-light my-3">
                            <i class="fas fa-phone pr-3 text-dark"></i>032 625 4592</li>
                        <li>
                            <i class="far fa-envelope-open pr-2 text-dark"></i>
                            <a href="mailto:mail@example.com" class="text-light">info 1@example.com</a>
                        </li>
                        <li class="mt-3">
                            <i class="far fa-envelope-open pr-2 text-dark"></i>
                            <a href="mailto:mail@example.com" class="text-light">info 2@example.com</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- //contact -->
    
        <!-- footer -->
        <footer class="text-center py-sm-5 py-4">
            <div class="container">
                <div class="footer-posi-agileinfo">
                    <h2 class="logo-2 font-weight-bold">
                        <a href="index.html" class="text-dark">
                            <span>B</span>eauty
                            <span>S</span>pa</a>
                    </h2>
                    <div class="social my-4">
                        <ul>
                            <li>
                                <a href="#" class="link facebook" target="_parent">
                                    <i class="fab fa-facebook-f"></i>
                                </a>
                            </li>
                            <li class="mx-3">
                                <a href="#" class="link twitter" target="_parent">
                                    <i class="fab fa-twitter"></i>
                                </a>
                            </li>
                            <li>
                                <a href="#" class="link google-plus" target="_parent">
                                    <i class="fab fa-google-plus-g"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- copyright -->
                    <p class="copy-right-grids">© 2018 HoangGia Spa. All Rights Reserved | Design by
                        <a href="https://w3layouts.com/" target="_blank">W3layouts</a>
                        <a href="loginRequest">Đăng nhập</a>
                    </p>
                    <!-- //copyright -->
                </div>
            </div>
        </footer>
        <!-- //footer -->

    </body>
    <!-- JavaScript -->
	<script src="${pageContext.request.contextPath}/source/js_home/jquery-2.2.3.min.js"></script>
	<!-- Default-JavaScript-File -->

	<script src="${pageContext.request.contextPath}/source/js_home/bootstrap.js"></script>
    
    </html>