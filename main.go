package main

import (
	"github.com/astaxie/beego"
	"ipdsgo/controllers"
	"net/http"
	"net/http"
	"crypto/md5"
	"io"
	"strconv"
	"fmt"
	"os"
	"html/template"
	"time"
)

}
func main() {
	beego.Router("/", &controllers.MainController{})
	beego.SetStaticPath("/html","views/html")
	beego.Router("/upload", &controllers.FormController{})

	beego.Router("/REST/", &controllers.RESTController{}, "get:ListTasks;post:NewTask")
	beego.Router("/REST/:id:int", &controllers.RESTController{}, "get:GetTask;put:UpdateTask")


	beego.Run()
}
