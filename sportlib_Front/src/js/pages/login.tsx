import * as React from "react";

import {Redirect} from "react-router-dom";

//Typescript
interface Props {
  title: string;
}

//Typescript
interface State {
  username: string;
  password: string;
  grant_type: string;
  access_token: string;
  user: object;
  userIsDefined: boolean;
}

class Login extends React.Component<Props, State> {
  constructor(props) {
    super(props);

    this.state = {
      username: "dloisel",
      password: "123*",
      grant_type: "password";
      access_token: "",
      user: {},
      userIsDefined: false
    };

    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount() {
    // window.localStorage.clear();
  }

  handleSubmit(event) {
    event.preventDefault();

    fetch("http://localhost:9090/oauth/token", {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded"
      },
      body:
        "username=" +
        this.state.username +
        "&password=" +
        this.state.password +
        "&grant_type=" +
        this.state.grant_type +
        "",
        mode: "cors",
      credentials: "include"
    }).then(data => {
      data.json().then(results => {
          console.log(results);
          window.localStorage.setItem("access_token", this.state.access_token);

      });
    });
  }

  render() {
    if (this.state.userIsDefined) {
      return (

        //si connecter alors redirigé a ma page home 
        <Redirect
          to={{
            pathname: "/"
          }}
        />
      );
    }

    return (
      <React.Fragment>
        <h1>My login page</h1>
        <form onSubmit={this.handleSubmit}>
          <label>username :</label>
          <input name="username" />
          <label>Password :</label>
          <input name="password" />
          <button>Se connecter</button>
        </form>
      </React.Fragment>
    );
  }
}

export default Login;