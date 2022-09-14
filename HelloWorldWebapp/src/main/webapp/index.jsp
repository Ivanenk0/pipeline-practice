<html>
    <head>
        <title>HomePage</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            html {
                background-color: #72727e;
                font-family: monospace;
                margin: 0px;
                padding: 0px;
            }
            .content {
                width: 350px;
                height: fit-content;
                padding: 25px 20px;
                margin: 100px auto 10px;
                background-color: #bbbdf6;
                text-align: center;
                border-radius: 10px;
            }
            #pipeline-image {
                width: 150px;
                height: 150px;
                align-items: left;
            }
            .image {
                width: 150px;
                height: 150px;
            }
            .project-info {
                width: 180px;
                height: 150px;
                text-align: center;
                margin-left: 20px;
            }
            .header {
                display: flex;
            }
            #name {
                font-size: 40px;
                padding: 0px;
                margin: 5px;
            }
            #tools {
                font-size: 15px;
                padding: 0px;
                margin: 5px;
            }
            input {
                border: 2px solid #72727e;
                border-radius: 7px;
                background-color: #797a9e;
                color: white;
                width: 200px;
                height: 50px;
                font-size: 20px;
                margin: 10px;
            }
            input:hover {
                background-color: #bbbdf6;
                color: black;
            }
            .footer {
                width: 200px;
                margin: 100px auto 0px;
                padding: 25px 20px;
                text-align-last: center;
                background-color: #bbbdf6;
                border-radius: 10px 10px 0px 0px;
            }
        </style>
    </head>
    <body>
        <div class="content">
            <div class="header">
                <div class="image">
                    <img src="HelloWorldWebapp/src/main/resources/pipeline.png" alt="pipeline img" id="pipeline-image">
                </div>  <!-- END OF .IMAGE -->
                <div class="project-info">
                    <p id="name">Pipeline</p>
                    <p id="tools">Jenkins<br />Tomcat<br />PostgreSQL</p>
                </div>  <!-- END OF .PROJECT-INFO -->
            </div>  <!-- END OF .HEADER -->
            <div class="navigation">
                <form>
                    <input type="button" value="Browse users">
                    <input type="button" value="Add new user">
                    <input type="button" value="Remove user">
                    <input type="button" value="Modify user">
                </form>
            </div>  <!-- END OF .NAVIGATION -->
        </div>  <!-- END OF .CONTENT -->
        <div class="footer">
            <p>Dmytro | Artyom | Illia</p>
            <a href="https://www.youtube.com/watch?v=SoPE3Mcd-HU">Cool YT Video</a>
        </div>  <!-- END OF .FOOTER -->
    </body>
</html>