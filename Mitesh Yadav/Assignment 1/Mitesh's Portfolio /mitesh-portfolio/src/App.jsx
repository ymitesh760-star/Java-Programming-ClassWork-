import "./index.css";

function App() {
  return (
    <div className="site">

      <nav className="navbar">
        <div className="logo">MY.</div>

        <div className="nav-right">
          <span>01</span>
          <span>MENU</span>
        </div>
      </nav>

      <main className="hero">

        <div className="hero-small">
          CREATIVE DEVELOPER
        </div>

        <h1 className="hero-title">
          MITESH
          <br />
          YADAV
        </h1>

        <div className="hero-description">
          I BUILD DIGITAL
          <br />
          EXPERIENCES.
        </div>

        <div className="hero-bottom">
          <span>BASED IN MUMBAI</span>

          <span className="scroll">
            SCROLL TO ENTER
            <span className="arrow">↓</span>
          </span>

          <span>2026</span>
        </div>

        <div className="monolith">
          <div className="monolith-inner">
            M
          </div>
        </div>

      </main>

    </div>
  );
}

export default App;