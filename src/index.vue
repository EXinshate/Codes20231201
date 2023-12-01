    <el-form ref="loginForm" :model="loginForm" :rules="loginRules" class="login-form"
         auto-complete="on" label-position="left">
       <div class="title-container">
         <h3 class="title">管理员登录</h3>
       </div>
       <el-form-item prop="username">
         <span class="svg-container svg-container_login">
           <svg-icon icon-class="user" />
         </span>
         <el-input v-model="loginForm.username" name="username" type="text" auto-
              complete="on" placeholder="username" />
       </el-form-item>

       <el-form-item prop="password">
          <span class="svg-container">
            <svg-icon icon-class="password" />
          </span>
          <el-input :type="passwordType" v-model="loginForm.password" name="password"
                auto-complete="on" placeholder="password" @keyup.enter.native="handleLogin" />
          <span class="show-pwd" @click="showPwd">
          <svg-icon icon-class="eye" />
             </span>
          </el-form-item>

          <el-button :loading="loading" type="primary" style="width:100%;margin-bottom:30px;"
                @click.native.prevent="handleLogin">登录</el-button>