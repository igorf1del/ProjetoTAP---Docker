import Carousel from 'react-bootstrap/Carousel';

export default function Promocoes() {
  return (
    <Carousel>
      <Carousel.Item>
        <img className='d-block w-100'
            src="https://www.freewebheaders.com/wp-content/gallery/travel-world-size-800x200_1/cache/manarola-italy-banner_size-800x200.jpg-nggid047678-ngg0dyn-800x200x100-00f0w010c010r110f110r010t010.jpg"
            alt="Primeiro Slide"
          />
        <Carousel.Caption>
          <h3>Primeiro Slide</h3>
          <p>Subtexto</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        <img className='d-block w-100'
            src="https://www.freewebheaders.com/wp-content/gallery/travel-world-size-800x200_1/cache/saarbrucken-city-lake-germany-night-scenery-landscape-banner_size-800x200.jpg-nggid047680-ngg0dyn-800x200x100-00f0w010c010r110f110r010t010.jpg"
            alt="Segundo Slide"
          />
        <Carousel.Caption>
          <h3>Segundo Slide</h3>
          <p>Subtexto</p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  )
}
