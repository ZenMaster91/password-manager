# Welcome to Password Manager Library!
#### Description
This library can be used to hash passwords in java and authenticate them later.

#### Hoy to use?
You have two options to use this library. You can directly download the ```.jar``` file and add it to your bulid path. Or you can download the source code and work from there. If you'r not going to modify the source files we strongly recommend to download and work with the ```.jar``` files.

##### Hash a password
To hash a password its as easier as call to ```new PasswordAuthentication().hash("your-password".toCharArray());``` this will return a ```String``` the will be something like ```$31$16$50KwonJTfmamSSQ-pAEmOUfE9Dm0O5ikVc-2l6VVkDo```.

##### Authenticate a password
Again the only you need is to call ``` new PasswordAuthentication().authenticate("your-password".toCharArray(), hashToken);``` and this will return a boolean. ```true``` if the password matches the ```hashToken```; ```false``` otherwise.

### How to contribute?
To contribute to this library please fork the repository, create a branch on to your own fork and when done create a pull request describing what have you change and why. Notice the [LICENSE](https://github.com/ips-myshop-2016/password-manager/blob/master/LICENSE)
